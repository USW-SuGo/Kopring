package com.usw.usgo.domain.core.notice

import com.usw.usgo.domain.core.BaseEntity
import com.usw.usgo.domain.embeddable.Content
import com.usw.usgo.domain.embeddable.Title
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "notice")
class Notice(

    @Embedded
    var title: Title,

    @Embedded
    var content: Content,
) : BaseEntity() {
}
