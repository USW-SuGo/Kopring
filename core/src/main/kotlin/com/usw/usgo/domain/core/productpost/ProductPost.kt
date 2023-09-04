package com.usw.usgo.domain.core.productpost

import com.usw.usgo.domain.core.BaseEntity
import com.usw.usgo.domain.core.user.User
import com.usw.usgo.domain.embeddable.Content
import com.usw.usgo.domain.embeddable.Price
import com.usw.usgo.domain.embeddable.Title
import com.usw.usgo.domain.enumerated.ContactPlace
import jakarta.persistence.*

@Entity
@Table(name = "product_post")
class ProductPost(

    @Embedded
    var title: Title,

    @Embedded
    var content: Content,

    @Embedded
    var price: Price,

    @Enumerated(EnumType.STRING)
    var contactPlace: ContactPlace,

    @Enumerated(EnumType.STRING)
    var status: Status = Status.NORMAL,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    val user: User,

    ) : BaseEntity()

enum class Status {
    NORMAL,
    RESTRICTED,
    DELETED,
}
