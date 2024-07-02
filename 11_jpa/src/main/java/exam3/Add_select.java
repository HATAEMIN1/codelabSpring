package exam3;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Add_select {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaEx01");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Member3 user = em.find(Member3.class,"test@test.com");
        if(user!=null){
            System.out.println("이름 = " + user.getName());
            System.out.printf("생성 = %tY -%<tm - %<td\n",user.getCreateDate());
        }else {
            System.out.println("데이터없음");
        }
        em.close();
        emf.close();
    }
}
