package br.com.gersonkm.swkata.datetime.dat_003

import br.com.gersonkm.swkata.datetime.helpers.DateTimeTestHelper.newLocalDate
import org.assertj.core.api.Assertions
import org.junit.Test

abstract class DAT_003_A_Tests(val SUT: DAT_003_A) {

    @Test
    fun `teste #1 - give me a better name, please!`() {
        val x = SUT.solve(newLocalDate("04/04/2017"))

        Assertions.assertThat(x).containsExactly(
                newLocalDate("03/04/2017"),
                newLocalDate("04/04/2017"),
                newLocalDate("05/04/2017"),
                newLocalDate("06/04/2017"),
                newLocalDate("07/04/2017")
        )
    }
}

class DAT_003_A_Java_Tests : DAT_003_A_Tests(DAT_003_A_Java())
class DAT_003_A_Kotlin_Tests : DAT_003_A_Tests(DAT_003_A_Kotlin())