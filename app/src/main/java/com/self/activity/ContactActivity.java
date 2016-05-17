package com.self.activity;

import com.self.domain.ContactBean;
import com.self.engine.ReadContactsEngine;

import java.util.List;

public class ContactActivity extends BaseListViewActivity {

    @Override
    public List<ContactBean> getDatas() {
        return ReadContactsEngine.getContacts(this);
    }
}
