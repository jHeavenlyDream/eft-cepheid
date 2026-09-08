package jhd.eftcepheid.repository

import jhd.eftcepheid.model.entity.ItemEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemRepository: JpaRepository<ItemEntity, Long> {
}