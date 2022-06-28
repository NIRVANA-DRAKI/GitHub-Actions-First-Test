package com.nirvana.githubactionsfirsttest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GitHubActionsFirstTestApplicationTests {

    @Test
    void Given_2Numbers_When_AddingThem_Then_TheAddResultIsReturned() {
        var x = 5;
        var y = 5;
        var result = x + y;

        assertThat(result)
                .as("The sum of 2 numbers should be equal to itself")
                .isEqualTo(x + y);
    }

//	@Test
//	void InvalidTest() {
//		var x = 5;
//		var y = 5;
//		var result = x + y;
//
//		assertThat(result)
//				.as("The sum of 2 numbers should be equal to itself")
//				.isEqualTo(x + 1);
//	}

}
