package br.com.gersonkm.swkata.datetime.dat_002

import br.com.gersonkm.swkata.datetime.helpers.DateTimeTestHelper.newLocalDate
import com.google.common.collect.Range
import org.assertj.core.api.Assertions
import org.junit.Test
import java.time.LocalDate
import java.time.YearMonth

abstract class DAT_002_A_Tests(val SUT: DAT_002_A) {
    @Test
    fun `teste #1 - give me a better name, please!`() {
        val x = SUT.solve( Range.closed(YearMonth.of(2017,2), YearMonth.of(2017,3)))

        Assertions.assertThat(x).containsExactly(
                 newLocalDate("01/02/2017"), LocalDate.of(2017,2,2),  LocalDate.of(2017,2,3),  LocalDate.of(2017,2,4)
                ,LocalDate.of(2017,2,5),  LocalDate.of(2017,2,6),  LocalDate.of(2017,2,7),  LocalDate.of(2017,2,8)
                ,LocalDate.of(2017,2,9),  LocalDate.of(2017,2,10), LocalDate.of(2017,2,11), LocalDate.of(2017,2,12)
                ,LocalDate.of(2017,2,13), LocalDate.of(2017,2,14), LocalDate.of(2017,2,15), LocalDate.of(2017,2,16)
                ,LocalDate.of(2017,2,17), LocalDate.of(2017,2,18), LocalDate.of(2017,2,19), LocalDate.of(2017,2,20)
                ,LocalDate.of(2017,2,21), LocalDate.of(2017,2,22), LocalDate.of(2017,2,23), LocalDate.of(2017,2,24)
                ,LocalDate.of(2017,2,25), LocalDate.of(2017,2,26), LocalDate.of(2017,2,27), LocalDate.of(2017,2,28)
                ,LocalDate.of(2017,3,1),  LocalDate.of(2017,3,2),  LocalDate.of(2017,3,3),  LocalDate.of(2017,3,4)
                ,LocalDate.of(2017,3,5),  LocalDate.of(2017,3,6),  LocalDate.of(2017,3,7),  LocalDate.of(2017,3,8)
                ,LocalDate.of(2017,3,9),  LocalDate.of(2017,3,10), LocalDate.of(2017,3,11), LocalDate.of(2017,3,12)
                ,LocalDate.of(2017,3,13), LocalDate.of(2017,3,14), LocalDate.of(2017,3,15), LocalDate.of(2017,3,16)
                ,LocalDate.of(2017,3,17), LocalDate.of(2017,3,18), LocalDate.of(2017,3,19), LocalDate.of(2017,3,20)
                ,LocalDate.of(2017,3,21), LocalDate.of(2017,3,22), LocalDate.of(2017,3,23), LocalDate.of(2017,3,24)
                ,LocalDate.of(2017,3,25), LocalDate.of(2017,3,26), LocalDate.of(2017,3,27), LocalDate.of(2017,3,28)
                ,LocalDate.of(2017,3,29), LocalDate.of(2017,3,30), LocalDate.of(2017,3,31)
        )
    }
}

class DAT_002_A_Java_Tests : DAT_002_A_Tests(DAT_002_A_Java())
class DAT_002_A_Kotlin_Tests : DAT_002_A_Tests(DAT_002_A_Kotlin())