package com.usw.usgo.domain.core.userpost

import com.usw.usgo.domain.core.BaseEntity
import com.usw.usgo.domain.core.productpost.ProductPost
import com.usw.usgo.domain.core.user.User
import jakarta.persistence.*

@Entity
@Table(name = "post_like")
class PostLike(

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    val user: User,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_post_id")
    val productPost: ProductPost,

    ) : BaseEntity()
