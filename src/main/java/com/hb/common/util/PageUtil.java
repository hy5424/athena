package com.hb.common.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class PageUtil {
    private static final int PAGE = 1, SIZE = 10;

    public static Pageable getPage() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest (PAGE, SIZE, sort);
        return pageable;
    }

}
