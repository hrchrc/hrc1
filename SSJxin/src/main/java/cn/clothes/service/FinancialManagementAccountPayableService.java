package cn.clothes.service;

import java.util.List;

import org.springframework.data.domain.Page;

import cn.clothes.domain.FinancialManagementAccountPayable;
import cn.clothes.utils.Result;
/**接口财务管理应付款服务*/
public interface FinancialManagementAccountPayableService {
	Result addFinancialManagementAccountPayable(FinancialManagementAccountPayable financialManagementAccountPayable);
	Integer getTotalCount();
	Page<FinancialManagementAccountPayable> findAll(Integer page,Integer limit);
	Page<FinancialManagementAccountPayable> findByOrderid(String keyword,Integer page,Integer limit);
	Result deleteById(Long id);
	FinancialManagementAccountPayable findById(Long id);
	Result updateFinancialManagementAccountPayable(FinancialManagementAccountPayable financialManagementAccountPayable);
	List<FinancialManagementAccountPayable> findByPage(Integer page,Integer limit);
}
