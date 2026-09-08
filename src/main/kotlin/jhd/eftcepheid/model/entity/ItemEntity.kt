package jhd.eftcepheid.model.entity

import jakarta.persistence.*
import java.time.Instant

@Entity
@Table(name = "items")
open class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "items_id_gen")
    @SequenceGenerator(name = "items_id_gen", sequenceName = "item_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    @Column(name = "d_type", nullable = false)
    open var dType: Short? = null

    @Column(name = "name", nullable = false)
    open lateinit var name: String

    @Column(name = "description", length = Integer.MAX_VALUE)
    open var description: String? = null

    @Column(name = "created_at")
    open var createdAt: Instant? = null

    @Column(name = "updated_at")
    open var updatedAt: Instant? = null
}