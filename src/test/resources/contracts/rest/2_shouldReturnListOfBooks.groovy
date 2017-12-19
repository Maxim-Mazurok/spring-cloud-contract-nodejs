package rest

import org.springframework.cloud.contract.spec.Contract

Contract.make {
	description """
Should return info about other endpoints to query
"""
	request {
		method GET()
		url "/api/books"
	}
	response {
		status 200
		headers {
			contentType(applicationJson())
		}
		body("""
	{ 
		"title" : "Title",
		"genre" : "Genre",
		"description" : "Description",
		"author" : "Author",
		"publisher" : "Publisher",
		"pages" : 100,
		"image_url" : "https://d213dhlpdb53mu.cloudfront.net/assets/pivotal-square-logo-41418bd391196c3022f3cd9f3959b3f6d7764c47873d858583384e759c7db435.svg",
		"buy_url" : "https://pivotal.io"
	}
""")
	}
}