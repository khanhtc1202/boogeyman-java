package infrastructure.service;

import domain.ResultList;

public interface Spider {
    ResultList fetchResultList(String keyword);
}
