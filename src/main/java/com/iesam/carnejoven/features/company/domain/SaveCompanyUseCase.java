package com.iesam.carnejoven.features.company.domain;

public class SaveCompanyUseCase {
    private  CompanyRepository companyRepository;

    public SaveCompanyUseCase(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }


    public void execute(Company company){
        companyRepository.saveCompany(company);
    }
}
