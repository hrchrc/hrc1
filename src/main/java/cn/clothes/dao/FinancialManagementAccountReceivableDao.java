package cn.clothes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;


import cn.clothes.domain.FinancialManagementAccountReceivable;
@Component
public interface FinancialManagementAccountReceivableDao extends JpaRepository<FinancialManagementAccountReceivable, Long>,JpaSpecificationExecutor<FinancialManagementAccountReceivable>{
	//JpaRepository支持接口规范方法名查询。意思是如果在接口中定义的查询方法符合它的命名规则,就可以不用写实现
}
