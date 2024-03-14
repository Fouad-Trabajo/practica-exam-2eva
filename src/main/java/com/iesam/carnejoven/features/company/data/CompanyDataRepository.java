package com.iesam.carnejoven.features.company.data;

import com.iesam.carnejoven.features.company.data.local.CompanyFileDataSource;
import com.iesam.carnejoven.features.company.domain.Company;
import com.iesam.carnejoven.features.company.domain.CompanyRepository;

public class CompanyDataRepository implements CompanyRepository {

    private CompanyFileDataSource companyFileDataSource;

    public CompanyDataRepository(CompanyFileDataSource companyFileDataSource) {
        this.companyFileDataSource = companyFileDataSource;
    }

    @Override
    public void saveCompany(Company company) {
        companyFileDataSource.save(company);
    }

    @Override
    public Company getCompany(String id) {
        return companyFileDataSource.findById(id);
    }
}
