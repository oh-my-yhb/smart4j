package chapter2.service;

import chapter2.helper.DatabaseHelper;
import chapter2.model.Customer;
import chapter2.util.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * @author yan hongbo
 * @date 2021/1/26 14:30
 * @description 提供客户数据服务
 */
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);


    /**
     * 获取客户列表
     *
     * @return
     */
    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    /**
     * 获取客户
     *
     * @param id
     * @return
     */
    public Customer getCustomer(long id) {
        String sql = "SELECT * FROM customer WHERE id = " + id;
        return DatabaseHelper.queryEntity(Customer.class, sql);
    }

    /**
     * 创建客户
     *
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     *
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     *
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }

}
