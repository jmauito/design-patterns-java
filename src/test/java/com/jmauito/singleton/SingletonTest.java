package com.jmauito.singleton;

import com.jmauito.singleton.company.Company;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SingletonTest {
    @Test
    public void shouldCompanyAAndCompanyBBeTheSame()
    {
        Company companyA = Company.getInstance();
        Company companyB = Company.getInstance();

        assertTrue(companyA.equals(companyB));
    }

    @Test
    public void shouldTheSameInformationBeShownForBothCompanyAAndCompanyB()
    {
        Company companyA = Company.getInstance();
        Company companyB = Company.getInstance();

        String companyAInfo = companyA.toString();
        String companyBInfo = companyB.toString();

        assertEquals(companyAInfo, companyBInfo);
    }


}
