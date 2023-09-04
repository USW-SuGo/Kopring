package com.usw.usgo.domain.core.user

import com.usw.usgo.domain.core.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "user")
class User(
    @Column(name = "login_id", length = 50, nullable = false)
    val loginId: String,

    @Column(name = "email", length = 50, nullable = false)
    val email: String,

    @Column(name = "nickname", length = 50, nullable = false)
    var nickname: String,

    @Column(name = "password", length = 50, nullable = false)
    var password: String,

    @Embedded
    val manner: Manner,

    @Embedded
    val cooperation: Cooperation,

    @Enumerated(value = EnumType.STRING)
    var status: Status = Status.NORMAL,

    @Enumerated(value = EnumType.STRING)
    var role: Role
) : BaseEntity() {

}

enum class Status {
    NORMAL,
    WITHDRAW,
    RESTRICTED,
    SLEEPING,
}

enum class Role {
    ROLE_USER,
    ROLE_ADMIN,
}
