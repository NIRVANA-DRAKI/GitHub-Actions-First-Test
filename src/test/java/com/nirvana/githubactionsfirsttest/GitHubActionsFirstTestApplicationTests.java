package com.nirvana.githubactionsfirsttest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GitHubActionsFirstTestApplicationTests {

	// TODO: Delete this comment, it is just for testing gradle cache.
    @Test
    void Given_2Numbers_When_AddingThem_Then_TheAddResultIsReturned() {
        var x = 5;
        var y = 5;
        var result = x + y;

        assertThat(result)
                .as("The sum of 2 numbers should be equal to itself")
                .isEqualTo(x + y);
    }

}
