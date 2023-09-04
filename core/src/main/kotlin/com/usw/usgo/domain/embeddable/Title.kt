package com.usw.usgo.domain.embeddable

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
class Title(

    @Column(nullable = false)
    val value: String,
)