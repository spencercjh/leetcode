package top.spencercjh.demo.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service
import top.spencercjh.demo.entity.Clazz

/**
 * @author spencer
 */
@Service
interface ClazzRepository : JpaRepository<Clazz, Int> {
}