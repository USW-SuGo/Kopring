package com.usw.usgo.domain.notice

import com.usw.usgo.domain.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "notices")
class Notice(
    @Column(length = 50)
    var title: String,

    @Column(columnDefinition = "text")
    var content: String,
) : BaseEntity() {
}
