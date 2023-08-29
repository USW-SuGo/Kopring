package com.usw.usgo.domain.productpost

import com.usw.usgo.domain.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "product_posts")
class ProductPost(
    val userId: Long,

    @Column(length = 50)
    var title: String,

    @Column(columnDefinition = "text")
    var content: String,

    @Column(length = 50)
    var contactPlace: String,

    var price: Int,

    @Enumerated(EnumType.STRING)
    var status: Status = Status.NORMAL,
    ) : BaseEntity() {
}

enum class Status {
    NORMAL,
    RESTRICTED,
    DELETED,
}
