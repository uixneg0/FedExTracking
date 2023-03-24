package org.uixneg0.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class OAuth {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column(nullable = false, length = 2048)
	private String token;
	@Column(nullable = false)
	private Long expirationTime;

	public OAuth(String token, Long expirationTime) {
		this.token = token;
		this.expirationTime = expirationTime;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		OAuth oAuth = (OAuth) o;
		return id != null && Objects.equals(id, oAuth.id);
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
