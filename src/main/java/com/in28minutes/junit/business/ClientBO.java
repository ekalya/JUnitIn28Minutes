package com.in28minutes.junit.business;

import java.util.List;
import com.in28minutes.junit.business.exception.DifferentCurrenciesException;
import com.in28minutes.junit.model.Amount;
import com.in28minutes.junit.model.Product;

/**
 * Sample Class
 * @author elisha
 */
public interface ClientBO {

    /**
     *
     * @param products
     * @return
     * @throws DifferentCurrenciesException
     */
    Amount getClientProductsSum(List<Product> products)
            throws DifferentCurrenciesException;

}
