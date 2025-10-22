package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *  This method is used to create an account for a customer
     * @param customerDto
     */
    public void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return
     */
    public CustomerDto fetchByMobileNumber(String mobileNumber);

    /**
     *
     * @param customerDto
     * @return
     */
    public boolean updateAccount(CustomerDto customerDto);

    /**
     * 
     * @param mobileNumber
     * @return
     */
    public boolean deleteAccount(String mobileNumber);
}
