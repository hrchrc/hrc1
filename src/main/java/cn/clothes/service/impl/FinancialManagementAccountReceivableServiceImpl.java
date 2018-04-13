package cn.clothes.service.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import cn.clothes.dao.FinancialManagementAccountReceivableDao;
import cn.clothes.domain.FinancialManagementAccountReceivable;
import cn.clothes.service.FinancialManagementAccountReceivableService;
import cn.clothes.utils.Result;

@Service
@Transactional
/**实现供应商服务接口类*/
public class FinancialManagementAccountReceivableServiceImpl implements FinancialManagementAccountReceivableService{
	@Autowired
	private FinancialManagementAccountReceivableDao financialManagementAccountReceivableDao;
	@Override
	public Integer getTotalCount() {
		// TODO Auto-generated method stub
		return (int) financialManagementAccountReceivableDao.count();
	}
	@Override
	public Page<FinancialManagementAccountReceivable> findAll(Integer page,Integer limit) {
		// TODO Auto-generated method stub
		 return financialManagementAccountReceivableDao.findAll(new PageRequest(page, limit));
	}
	@Override
	public Page<FinancialManagementAccountReceivable> findByOrderid(String keyword,Integer page,Integer limit) {
		// TODO Auto-generated method stub
		Pageable pageable=new PageRequest(page, limit);
		Specification<FinancialManagementAccountReceivable> spec =new Specification<FinancialManagementAccountReceivable>() {
			
			@Override
			public Predicate toPredicate(Root<FinancialManagementAccountReceivable> root, CriteriaQuery<?> query,
					CriteriaBuilder cb) {
				// TODO Auto-generated method stub
				Path<Integer> orderid = root.get("orderid");
				Predicate p = cb.equal(orderid, keyword);
				return p;
			}
		};
		return financialManagementAccountReceivableDao.findAll(spec,pageable);
	}
	@Override
	public Result deleteById(Long id) {
		// TODO Auto-generated method stub
		financialManagementAccountReceivableDao.deleteById(id);
		return Result.ok();
	}
	@Override
	public FinancialManagementAccountReceivable findById(Long id) {
		// TODO Auto-generated method stub
		return financialManagementAccountReceivableDao.findById(id).get();
	}
	@Override
	public Result updateFinancialManagementAccountReceivable(
			FinancialManagementAccountReceivable FinancialManagementAccountReceivable) {
		// TODO Auto-generated method stub
		 financialManagementAccountReceivableDao.saveAndFlush(FinancialManagementAccountReceivable);
		 return Result.ok();
	}
	@Override
	public Result addFinancialManagementAccountReceivable(FinancialManagementAccountReceivable FinancialManagementAccountReceivable) {
		// TODO Auto-generated method stub
		 financialManagementAccountReceivableDao.save(FinancialManagementAccountReceivable);
		 return Result.ok();
	}
	@Override
	public List<FinancialManagementAccountReceivable> findByPage(Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return null;
	}

}
