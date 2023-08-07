package com.dreamer.todolist.repository

import org.hibernate.annotations.ColumnDefault
import jakarta.persistence.*

@Entity         // DB 테이블과 연결 선언
class Todo (
        @Id     // Entity의 기본 키 선언
        @GeneratedValue(strategy = GenerationType.IDENTITY)     // 기본 키를 자동 생성함을 선언
        var id: Long? = null,   // 본 Entity의 기본 키로 id 필드 선언, 해당 필드는 기본적으로 Long 타입이나 null 값일 수도 있음

        @Column(nullable = false)       // 데이터베이스의 열 선언, nullable = false로 null 값은 올 수 없음
        @ColumnDefault("false")         // 아래 선언할 필드가 DB에 삽입 될 때 false 값임을 선언
        var completed: Boolean = false, // completed 필드는 boolean의 false 값

        @Column(nullable = false)       // 위와 같음
        var todoName: String            // todoName 필드를 문자열로 선언, 기본값이 없으므로 DB에 반드시 값이 있어야함

        // 본 클래스는 테이블과 매핑되며, 해당 테이블은 id, completed, todoName 열로 구성됨
)