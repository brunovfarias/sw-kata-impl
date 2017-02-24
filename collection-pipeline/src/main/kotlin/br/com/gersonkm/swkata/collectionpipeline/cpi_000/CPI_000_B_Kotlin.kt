package br.com.gersonkm.swkata.collectionpipeline.cpi_000

class CPI_000_B_Kotlin : CPI_000_B {

    override fun solve(coffeeBrands: List<CoffeeBrand>): String {
        return coffeeBrands.joinToString { it.name }
    }

}