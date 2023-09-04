package com.usw.usgo.domain.core.user

import jakarta.persistence.Embeddable
import java.math.BigDecimal

@Embeddable
class Manner(
    var grade: BigDecimal = BigDecimal(36.5),
    var evaluationCount: Int = 0,
) {
}
