package br.com.gersonkm.swkata.datetime.dat_002

import com.google.common.collect.Range
import org.junit.Test
import java.time.YearMonth

abstract class DAT_002_A_Tests(val SUT: DAT_002_A) {
    @Test
    fun `teste #1 - give me a better name, please!`() {
        val x = SUT.solve( Range.closed(YearMonth.of(2017,2), YearMonth.of(2017,3)))
        //Como testar? assertThat(x)
    }
}

class DAT_002_A_Java_Tests : DAT_002_A_Tests(DAT_002_A_Java())
class DAT_002_A_Kotlin_Tests : DAT_002_A_Tests(DAT_002_A_Kotlin())