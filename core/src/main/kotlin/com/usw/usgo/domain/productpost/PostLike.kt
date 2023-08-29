package com.usw.usgo.domain.productpost

import com.usw.usgo.domain.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "post_likes")
class PostLike(
    val userId: Int,
    val postId: Int,
    var isDeleted: Boolean
) : BaseEntity() {
}
