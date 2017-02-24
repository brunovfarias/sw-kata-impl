package br.com.gersonkm.swkata.collectionpipeline.cpi_000

class CPI_000_A_Kotlin : CPI_000_A {

    override fun solve(coffeeBrands: List<CoffeeBrand>): List<String> {
        return coffeeBrands.map { it.name }
    }

}