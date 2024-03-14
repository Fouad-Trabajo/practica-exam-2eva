package com.iesam.carnejoven.features.company.domain;

public class GetCompanyUseCase {

    private  CompanyRepository companyRepository;

    public GetCompanyUseCase(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company execute(String id){
        return companyRepository.getCompany(id);
    }
}
