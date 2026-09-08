package jhd.eftcepheid.service

import jhd.eftcepheid.extension.toItemResponse
import jhd.eftcepheid.model.dto.ItemResponse
import jhd.eftcepheid.model.entity.ItemEntity
import jhd.eftcepheid.repository.ItemRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class ItemService (
    private val itemRepository: ItemRepository
){
    fun findAll(): List<ItemResponse> = itemRepository.findAll().map { it.toItemResponse() }

    fun findById(id: Long): ItemResponse = itemRepository.findById(id)
        .orElseThrow { ResponseStatusException(HttpStatus.NOT_FOUND, "Item $id не найден") }
        .toItemResponse()

    fun save(item: ItemEntity): ItemResponse {
        val saved = itemRepository.save(item)
        return saved.toItemResponse();
    }

    fun delete(id: Long) = itemRepository.deleteById(id)
}