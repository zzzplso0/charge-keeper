package kr.chargekeeper.chargekeeper;

import org.springframework.boot.SpringApplication;

public class TestChargekeeperApplication {

	public static void main(String[] args) {
		SpringApplication.from(ChargekeeperApplication::main).with(TestcontainersConfiguration.class).run(args);
	}
}
