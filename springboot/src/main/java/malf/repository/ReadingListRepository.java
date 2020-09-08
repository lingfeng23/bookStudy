package malf.repository;

import malf.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author malf
 * @createTime 2020/9/8
 * @description 仓库接口：用于把 Book 对象持久化到数据库的仓库
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
	/**
	 * 通过读者的用户名来查找阅读列表
	 * @param reader
	 * @return
	 */
	List<Book> findByReader(String reader);
}
