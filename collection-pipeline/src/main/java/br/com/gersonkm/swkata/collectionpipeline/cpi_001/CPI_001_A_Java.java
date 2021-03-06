package br.com.gersonkm.swkata.collectionpipeline.cpi_001;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CPI_001_A_Java implements CPI_001_A {

    @NotNull @Override
    public Map<String, String> solve(@NotNull List<Livro> livros) {
        return livros.stream()
                .collect(Collectors.toMap(Livro::getIsbn, Livro::getTitulo));
    }
}