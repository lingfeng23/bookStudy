package malf.repository;

import malf.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author malf
 * @description 用来持久化读者信息的仓库接口
 * @project bookStudy
 * @since 2020/9/9
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {

}
