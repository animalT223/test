package com.service;

import java.util.List;

import com.dao.WorkDao;
import com.entity.Work;

/**
 * 业务层
 * 
 * @author 刘诗樱
 *
 */
public class WorkService {
	private WorkDao workDao = new WorkDao();

	// 查询所有的工作笔记记录
	public List<Work> queryAllService() {
		return workDao.queryAll();
	}

	// 根据标题查询工作笔记记录数
	public int queryByTitleService(String title) {
		return workDao.queryByTitle(title);
	}

	// 根据笔记编号查询指定工作笔记信息
	public Work queryByIdService(int id) {
		return workDao.queryById(id);
	}

	// 添加工作笔记
	public int addWorkService(Work work) {
		return workDao.addWork(work);
	}
}
