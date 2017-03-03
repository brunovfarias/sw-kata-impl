package br.com.gersonkm.swkata.collectionpipeline.cpi_001;

import org.apache.commons.lang3.NotImplementedException;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CPI_001_B_Java implements CPI_001_B {

    @NotNull @Override
    public Map<String, Livro> solve(@NotNull List<Livro> livros) {
        return livros.stream()
                .sorted(Comparator.comparing(Livro::getDataPublicacao))
                .collect(Collectors.toMap(Livro::getIsbn, it -> it, (l1,l2) -> l1, LinkedHashMap::new));
    }
}