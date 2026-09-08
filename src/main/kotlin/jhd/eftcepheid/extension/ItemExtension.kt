package jhd.eftcepheid.extension

import jhd.eftcepheid.model.dto.ItemResponse
import jhd.eftcepheid.model.entity.ItemEntity

fun ItemEntity.toItemResponse() = ItemResponse(
    id = id ?: throw IllegalStateException("Item без id"),
    name = name,
    description = description
)