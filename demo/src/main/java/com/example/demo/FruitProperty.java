package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties("fruit")
public class FruitProperty {
    // @ConfigurationProperties ����Ϸ��� �ش� Ŭ������ @Component�� �����ؾ� �� �׷��� ������ ������ ������
    // ���λ簡 fruit�� ������ƼŰ���� �о�ͼ� �ʵ尪�� ������
    private List<Map> list;

	public List<Map> getList() {
		return list;
	}
    
}