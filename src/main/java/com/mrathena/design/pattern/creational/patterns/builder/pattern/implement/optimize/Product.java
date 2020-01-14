package com.mrathena.design.pattern.creational.patterns.builder.pattern.implement.optimize;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author mrathena on 2020/1/14 16:18
 */
@Getter
@Setter
@ToString
public class Product {

	/**
	 * required
	 */
	private final String head;
	private final String body;
	/**
	 * optional
	 */
	private final String arm;
	private final String leg;
	private final String foot;

	private Product(ProductBuilder builder) {
		this.head = builder.head;
		this.body = builder.body;
		this.arm = builder.arm;
		this.leg = builder.leg;
		this.foot = builder.foot;
	}

	public static class ProductBuilder {
		private final String head;
		private final String body;
		private String arm;
		private String leg;
		private String foot;

		public ProductBuilder(String head, String body) {
			this.head = head;
			this.body = body;
		}

		public ProductBuilder arm(String arm) {
			this.arm = arm;
			return this;
		}

		public ProductBuilder leg(String leg) {
			this.leg = leg;
			return this;
		}

		public ProductBuilder foot(String foot) {
			this.foot = foot;
			return this;
		}

		public Product build() {
			return new Product(this);
		}

	}

}
