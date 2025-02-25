package org.example.model.dao;

import org.example.db.DB;
import org.example.model.dao.impl.DepartmentDaoJDBC;
import org.example.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {

        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }

}
