package com.usw.usgo.domain.user

import com.usw.usgo.domain.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "users")
class User(
    @Column(length = 50)
    val loginId: String,

    @Column(length = 50)
    val email: String,

    @Column(length = 50)
    var nickname: String,

    @Column(length = 50)
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
