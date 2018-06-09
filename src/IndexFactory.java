
public class IndexFactory {
	public static IndexingEngine getIndex(boolean basicMode, String docsFile) throws Exception
	{
		if (basicMode) {
			return new IndexingEngine(docsFile);
		} 
		return new ImprovedIndexingEngine(docsFile);
	}
}
