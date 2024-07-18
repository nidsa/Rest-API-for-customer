package com.CustomerApiApplication.CustomerApiApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCostomers(){
        return customerRepository.findAll();
    }
    public Optional<Customer> getCustomerByPhonenumber(String phonenumber){
        return customerRepository.findByCusPhonenumber(phonenumber);
    }
    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    public Customer updateCustomer(int id,Customer customerDetails){
        Customer customer=customerRepository.findById(id).orElseThrow(()->new RuntimeException("customer not found"));
        customer.setCus_fist_name(customerDetails.getCus_fist_name());
        customer.setCus_last_name(customerDetails.getCus_last_name());
        customer.setCus_phonenumber(customerDetails.getCus_phonenumber());
        return  customerRepository.save(customer);
    }
}
