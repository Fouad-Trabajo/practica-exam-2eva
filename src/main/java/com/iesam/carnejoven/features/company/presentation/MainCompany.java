package com.iesam.carnejoven.features.company.presentation;

import com.iesam.carnejoven.features.company.data.CompanyDataRepository;
import com.iesam.carnejoven.features.company.data.local.CompanyFileDataSource;
import com.iesam.carnejoven.features.company.domain.Company;
import com.iesam.carnejoven.features.company.domain.GetCompanyUseCase;
import com.iesam.carnejoven.features.company.domain.SaveCompanyUseCase;


public class MainCompany {

    public static void saveUser(Company company) {
        CompanyFileDataSource companyFileDataSource = CompanyFileDataSource.newInstance();
        CompanyDataRepository companyDataRepository = new CompanyDataRepository(companyFileDataSource);
        SaveCompanyUseCase saveCompanyUseCase = new SaveCompanyUseCase(companyDataRepository);
        saveCompanyUseCase.execute(company);
    }

    public static void getUser(String id) {
        CompanyFileDataSource companyFileDataSource = CompanyFileDataSource.newInstance();
        CompanyDataRepository companyDataRepository = new CompanyDataRepository(companyFileDataSource);
        GetCompanyUseCase getCompanyUseCase = new GetCompanyUseCase(companyDataRepository);
        Company company = getCompanyUseCase.execute(id);
        System.out.println(company.toString());
    }


}
