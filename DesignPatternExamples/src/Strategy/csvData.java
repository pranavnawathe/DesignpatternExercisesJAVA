package Strategy;

class csvData implements data {

	public String whichDataType() {
		return "CSV";
	}

	public void extractData() {

		// blank below
		new csvExtraction().extract();

	}
}
