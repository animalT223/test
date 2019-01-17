package com.service;

import java.util.List;

import com.dao.WorkDao;
import com.entity.Work;

/**
 * ҵ���
 * 
 * @author ��ʫӣ
 *
 */
public class WorkService {
	private WorkDao workDao = new WorkDao();

	// ��ѯ���еĹ����ʼǼ�¼
	public List<Work> queryAllService() {
		return workDao.queryAll();
	}

	// ���ݱ����ѯ�����ʼǼ�¼��
	public int queryByTitleService(String title) {
		return workDao.queryByTitle(title);
	}

	// ���ݱʼǱ�Ų�ѯָ�������ʼ���Ϣ
	public Work queryByIdService(int id) {
		return workDao.queryById(id);
	}

	// ��ӹ����ʼ�
	public int addWorkService(Work work) {
		return workDao.addWork(work);
	}
}
