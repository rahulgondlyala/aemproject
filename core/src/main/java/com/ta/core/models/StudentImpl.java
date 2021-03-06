package com.ta.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = Student.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class StudentImpl implements Student{

    @Inject       // can also use @ValueMapValue instead of inject
    @Default (values = "")
    String fname;

    @Inject      // can also use @ValueMapValue instead of inject
    @Default (values = "")
    String lname;

    @Override
    public String getFirstName() {
        return fname;
    }

    @Override
    public String getLastName() {
        return lname;
    }


}
