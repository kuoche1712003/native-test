package io.kuoche

import io.smallrye.mutiny.coroutines.awaitSuspending
import jakarta.ws.rs.GET
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path

@Path("/api/v1.0/tests")
class TestResource (
    private val testDAO: TestDAO,
){

    @GET
    suspend fun tests(): List<Test> {
        return listOf(
            Test(TestPO::apple.bsonFieldName(), 1),
            Test("456", 2)
        )
    }

    @POST
    suspend fun test(
        request: Test
    ): Test {
        val testPO = TestPO(request.name, request.times)
        val response = testDAO.persist(testPO).awaitSuspending()
        return Test(response.apple, response.count)
    }
}